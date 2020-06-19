package eu.miroslavlehotsky.githubwebhook.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Pusher {
	private String name;
	private String email;
}