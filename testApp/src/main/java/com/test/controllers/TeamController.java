package com.test.controllers;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.domain.Team;
import com.test.services.TeamService;

@Controller
@RequestMapping("/test")
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	

	final static Logger logger = Logger.getLogger(TeamController.class);
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView loadAddPage(){
		logger.info("executing loadAddPage method");
		ModelAndView mv = new ModelAndView("add");
		mv.addObject("team", new Team());
		return mv;
	}
	
//	@RequestMapping(value="/add", method=RequestMethod.GET)
//	public ModelAndView loadEditPage(@PathVariable Long id){
//		ModelAndView mv = new ModelAndView("edit");
//		mv.addObject("team", teamService.getTeamById(id));
//		return mv;
//	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public ModelAndView loadListPage(){
		logger.info("executing loadListPage method");
		ModelAndView mv = new ModelAndView("list");
		List<Team>teams = teamService.loadAll();
		mv.addObject("teams", teams);
		return mv;
	}

}
