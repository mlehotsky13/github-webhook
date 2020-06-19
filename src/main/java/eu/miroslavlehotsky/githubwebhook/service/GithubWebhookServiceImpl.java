package eu.miroslavlehotsky.githubwebhook.service;

import java.text.MessageFormat;

import org.springframework.stereotype.Service;

import eu.miroslavlehotsky.githubwebhook.model.GithubPushEvent;

@Service
public class GithubWebhookServiceImpl implements GithubWebhookService {

	@Override
	public void processPushEvent(GithubPushEvent pushEvent) {
		// TODO
		String msg = "Received github push event from pusher {0}";
		System.out.println(MessageFormat.format(msg, pushEvent.getPusher().getEmail()));
	}
}