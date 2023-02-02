#!/usr/bin/env groovy

import com.sascar.ansible;

def call(String build_Tool) {
    println 'Building ' + build_Tool +  ' Application'

    deploy();
}