package com.skilldistillery.sites.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skilldistillery.sites.entities.Site;
import com.skilldistillery.sites.respositories.SiteRepository;

@Service
public class SiteServiceImpl implements SiteService {
	@Autowired
	private SiteRepository repo;

	@Override
	public Site FindById(int id) {
		Optional<Site> s = repo.findById(id);
		Site site = null;
		if (s.isPresent()) {
			site = s.get();
		}
		return site;
	}

	@Override
	public List<Site> allSites() {
		return repo.findAll();
	}

	@Override
	public List<Site> sitesByKeyword(String keyword) {
		keyword = "%" + keyword + "%";
		return repo.findByNameLikeOrUrlLike(keyword, keyword);
	}

	@Override
	public Site create(Site site) {
		return repo.save(site);
	}

	@Override
	public void delete(int id) {
		repo.deleteById(id);
	}

}
