package com.test.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.test.domain.Team;

@Repository
public class TeamDao {

	@Autowired
	private SessionFactory sessionFactory;

	public void createUpdate(Team team) {
		Session session = sessionFactory.openSession();
		session.saveOrUpdate(team);
		session.close();
	}

	public Team loadTeam(long id) {
		Session session = sessionFactory.openSession();
		Team team = (Team) session.load(Team.class, id);
		session.close();
		return team;
	}

	public List<Team> getAllTeams() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Team.class);
		List<Team> teams = criteria.list();
		session.close();
		return teams;
	}

	public void delete(Team team) {
		Session session = sessionFactory.openSession();
		session.delete(team);
		session.close();
	}

}
