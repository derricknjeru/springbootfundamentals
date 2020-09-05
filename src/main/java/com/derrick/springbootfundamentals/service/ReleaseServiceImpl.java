package com.derrick.springbootfundamentals.service;

import com.derrick.springbootfundamentals.entity.Release;
import com.derrick.springbootfundamentals.repository.ReleaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ReleaseServiceImpl implements ReleaseService {
    @Autowired
    private ReleaseRepository releaseRepository;

    @Override
    public Iterable<Release> listReleases() {
        return releaseRepository.findAll();
    }

}
