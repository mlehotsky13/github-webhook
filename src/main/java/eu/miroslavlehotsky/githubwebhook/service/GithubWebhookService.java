package eu.miroslavlehotsky.githubwebhook.service;

import eu.miroslavlehotsky.githubwebhook.model.GithubPushEvent;

public interface GithubWebhookService {

	/**
	 * Process received github push event
	 * 
	 * @param pushEvent to process
	 */
	void processPushEvent(GithubPushEvent pushEvent);
}
