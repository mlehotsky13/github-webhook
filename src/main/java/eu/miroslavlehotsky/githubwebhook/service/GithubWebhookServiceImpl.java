package eu.miroslavlehotsky.githubwebhook.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import eu.miroslavlehotsky.githubwebhook.model.GithubPushEvent;

@Service
public class GithubWebhookServiceImpl implements GithubWebhookService {
	
	@Value("${event.push.script}")
	private String pushEventScript;
	
	@Value("${event.push.targetBranch}")
	private String targetBranch;

	@Override
	public void processPushEvent(GithubPushEvent pushEvent) {
		try {
			String branch = pushEvent.getRef().split("/")[pushEvent.getRef().split("/").length - 1];
			if (targetBranch.equals(branch)) {
				Runtime.getRuntime().exec(new String[] { pushEventScript });
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}