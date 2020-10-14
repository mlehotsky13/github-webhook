package eu.miroslavlehotsky.githubwebhook.model;

import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class GithubPushEvent {
	private String ref;
	private Repository repository;
	private Pusher pusher;
	private List<Commit> commits;
}
