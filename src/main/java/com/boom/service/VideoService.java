package com.boom.service;

import com.boom.model.Video;
import java.lang.Iterable;


public interface VideoService{

  public Video create(Video video);
  public Video findOne(Long videoId);
  public Iterable<Video> findAll();
  //void delete(Video videoId);
  //Video update(Video video);


}