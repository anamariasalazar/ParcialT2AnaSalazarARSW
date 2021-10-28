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
        @org.springframework.beans.factory.annotation.Autowired
        @org.springframework.beans.factory.annotation.Qualifier("HttpConnectionImpl")
        edu.eci.covid.connection.impl.HttpConnectionImpl http;
        private java.util.concurrent.ConcurrentHashMap<java.lang.String,java.lang.String> countries;
        private java.util.concurrent.ConcurrentHashMap<java.lang.String,java.time.LocalDateTime> time;

        public cache()

        public java.lang.String getCovidByCountry(java.lang.String name) throws java.io.IOException, edu.eci.covid.connection.covidException {  }
    }