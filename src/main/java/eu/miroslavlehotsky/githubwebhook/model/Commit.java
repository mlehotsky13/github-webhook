package eu.miroslavlehotsky.githubwebhook.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Commit {
	private String id;
	private String message;
	private String url;
}