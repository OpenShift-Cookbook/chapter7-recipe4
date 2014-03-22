package org.osbook.jobstore.services;

import javax.ejb.Asynchronous;
import javax.ejb.Stateless;

import org.osbook.jobstore.domain.Job;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

@Stateless
public class TweetService {

	@Asynchronous
	public void tweet(Job job) {
		try {
			ConfigurationBuilder cb = new ConfigurationBuilder();
			cb.setDebugEnabled(true).setOAuthConsumerKey(System.getenv("TWITTER_CONSUMER_KEY"))
					.setOAuthConsumerSecret(System.getenv("TWITTER_CONSUMER_SECRET"))
					.setOAuthAccessToken(System.getenv("TWITTER_ACCESS_TOKEN_KEY"))
					.setOAuthAccessTokenSecret(System.getenv("TWITTER_ACCESS_TOKEN_SECRET"));
			Twitter twitter = new TwitterFactory(cb.build()).getInstance();
			twitter.updateStatus(job.getTitle());
		} catch (Exception e) {
			// don't do anything
			e.printStackTrace();
		}

	}
}
