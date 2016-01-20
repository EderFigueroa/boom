package com.boom.controllers.v1;

import com.boom.model.Video;
import com.boom.service.v1.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/video", produces = MediaType.APPLICATION_JSON_VALUE)
public class VideosController{

  private VideoService videoService;

  @Autowired
  public void setVideoService(VideoService videoService){
    this.videoService = videoService;
  }

  @RequestMapping(method= RequestMethod.POST)
  public ResponseEntity<Video> create(@RequestBody Video video){
    Video newVideo = videoService.create(video);
    return new ResponseEntity<Video>(newVideo, HttpStatus.OK);
  }

  @RequestMapping(method= RequestMethod.GET)
  public List<Video> getAll() {
    return videoService.findAll();
  }

  @RequestMapping(value = "{id}", method= RequestMethod.GET)
  public Video get(@PathVariable("id") String id) {
    return videoService.findOne(id);
  }

  @RequestMapping(value = "{id}", method= RequestMethod.DELETE)
  public Video delete(@PathVariable("id") String id) {
    return videoService.delete(id);
  }

  @RequestMapping(value = "{id}", method= RequestMethod.PUT)
  public Video update(@PathVariable("id") String id, @RequestBody Video video) {
    return videoService.update(id, video);
  }
}
