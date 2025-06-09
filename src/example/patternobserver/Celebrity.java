package example.patternobserver;

import java.util.ArrayList;

public class Celebrity implements Subject {
	private String celebrityName; // name of the celebrity
	private ArrayList<Observer> followers; // list of followers

	public Celebrity(String celebrityName) {
		this.celebrityName = celebrityName;
		followers = new ArrayList<Observer>();
	}

	// add follower to the celebrity's registered follower list
	@Override
	public void register(Observer o) {
		followers.add(o);
		System.out.println(o + " has started following " + celebrityName);
	}

	// remove follower from celebrity's registered follower list
	@Override
	public void unregister(Observer o) {
		followers.remove(o);
		System.out.println(o + " has stopped following " + celebrityName);
	}

	// Notify all the registered followers
	@Override
	public void notifyAllObservers(String tweet) {
		for (Observer follower : followers) {
			follower.update(celebrityName, tweet);
		}
		System.out.println();
	}

	// This method updates the tweet.
	// It will internally call notifyAllObservers(tweet) method
	// after updating the tweet.
	public void tweet(String tweet) {
		System.out.println("\n" + celebrityName + " has tweeted :: " + tweet + "\n");
		notifyAllObservers(tweet);
	}
}
