package com.boom.service.v1;

import com.boom.domains.VideoRepository;
import com.boom.model.Video;

import com.boom.service.v1.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;


@Service
@Validated
public class VideoServiceImpl implements VideoService {

  @Autowired
  private VideoRepository videoRepository;

  @Override
  @Transactional	
  public Video create(@NotNull @Valid final Video video){
    return videoRepository.save(video);
  }

  @Override
  @Transactional	
  public  Video findOne(String videoId){
    return videoRepository.findOne(Long.valueOf(videoId));
  }

  @Override
  @Transactional	
  public  List<Video> findAll(){
    Iterator<Video> source = videoRepository.findAll().iterator();
    List<Video> target = new ArrayList<>();
    source.forEachRemaining(target::add);
    return target;
  }

  @Override
  @Transactional
  public Video delete(String videoId) {
    Video deleted = videoRepository.findOne(Long.valueOf(videoId));
    this.videoRepository.delete(Long.valueOf(videoId));
    return deleted;
  }

  @Override
  @Transactional
  public Video update(String videoId, Video video) {
    Video videoToUpdate = videoRepository.findOne(Long.valueOf(videoId));
    videoToUpdate.setLikes(video.getLikes());
    videoToUpdate.setTitle(video.getTitle());
    videoToUpdate.setUri(video.getUri());
    return videoRepository.save(videoToUpdate);
  }



}