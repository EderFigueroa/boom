package com.boom.service.v1;

import com.boom.model.Video;
import java.lang.Iterable;
import java.util.List;


public interface VideoService{

  public Video create(Video video);
  public Video findOne(String videoId);
  public List<Video> findAll();
  public Video delete(String videoId);
  public Video update(String videoId, Video video);

}