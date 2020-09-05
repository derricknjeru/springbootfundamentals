package com.derrick.springbootfundamentals.service;


import com.derrick.springbootfundamentals.entity.Release;

public interface ReleaseService {
    Iterable<Release> listReleases();
}


