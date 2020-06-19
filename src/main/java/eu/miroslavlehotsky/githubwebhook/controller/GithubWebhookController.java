package eu.miroslavlehotsky.githubwebhook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.miroslavlehotsky.githubwebhook.model.GithubPushEvent;
import eu.miroslavlehotsky.githubwebhook.service.GithubWebhookService;

@RestController
@RequestMapping("/github-webhook/events")
public class GithubWebhookController {
	
	@Autowired
	private GithubWebhookService githubWebhookService;
	
	@PostMapping(path = "/push", consumes = MediaType.APPLICATION_JSON_VALUE)
	public void pushEvent(@RequestBody GithubPushEvent pushEvent) {
		githubWebhookService.processPushEvent(pushEvent);
	}
}