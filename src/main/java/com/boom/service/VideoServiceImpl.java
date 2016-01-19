package com.boom.service;

import com.boom.domains.VideoRepository;
import com.boom.model.Video;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.annotation.PostConstruct;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.lang.Iterable;


@Service
public class VideoServiceImpl implements VideoService {

  @Autowired
  private VideoRepository videoRepository;

  @Override
  @Transactional	
  public Video create(@NotNull @Valid final Video video){
    //Video newVideo = videoRepository.findOne(video.getId());
    return videoRepository.save(video);
  }

  @Override
  @Transactional	
  public  Video findOne(Long videoId){
  	Video result = videoRepository.findOne(videoId);
    return result;
  }

  @Override
  @Transactional	
  public  Iterable<Video>  findAll(){
    return videoRepository.findAll();
  }
}