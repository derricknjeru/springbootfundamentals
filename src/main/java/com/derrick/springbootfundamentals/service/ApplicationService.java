package com.derrick.springbootfundamentals.service;


import com.derrick.springbootfundamentals.entity.Application;

public interface ApplicationService {
    Iterable<Application> listApplications();
}


