package com.sascar.git;

def add(ArrayList files){
    println "git add ${files.join(" ")}"
}

def commit(String message){
    println "git commit -m ${message}" 
}

def push(){
    println "git push" 
}