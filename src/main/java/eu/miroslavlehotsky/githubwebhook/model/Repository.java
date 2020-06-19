package eu.miroslavlehotsky.githubwebhook.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Repository {
	private String name;
	private String full_name;
	private String url;
}