package com.test.services;

import java.util.List;

import com.test.domain.Team;

public interface TeamService {

	public void createTeam(Team t);
	
	public void updateTeam(Team t);
	
	public List<Team>loadAll();
	
	public void deleteTeam(Team t);
	
	public Team getTeamById(long id);
	
}
