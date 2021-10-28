package edu.eci.covid.cache;

import edu.eci.covid.connection.covidException;
import edu.eci.covid.connection.impl.HttpConnectionImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.ConcurrentHashMap;

public class cache {
    @Autowired
    @Qualifier("HttpConnectionImpl")