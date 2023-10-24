package com.myVideo.repository;

import org.springframework.stereotype.Repository;

import com.myVideo.entity.Videos;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface VideoRepository extends JpaRepository<Videos, Integer> {

}
