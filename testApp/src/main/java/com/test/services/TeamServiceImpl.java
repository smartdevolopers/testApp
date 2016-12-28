package com.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.dao.TeamDao;
import com.test.domain.Team;

@Service
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamDao teamDao;

	public void createTeam(Team t) {
		teamDao.createUpdate(t);
		
	}

	public void updateTeam(Team t) {
		teamDao.createUpdate(t);
	}

	public List<Team> loadAll() {
		return teamDao.getAllTeams();
	}

	public void deleteTeam(Team t) {
		teamDao.delete(t);
	}

	public Team getTeamById(long id) {
		return teamDao.loadTeam(id);
	}

	
	
}
