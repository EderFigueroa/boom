package com.boom.domains;

import java.util.List;
import org.springframework.data.repository.CrudRepository;
import com.boom.model.Video;

public interface VideoRepository extends CrudRepository<Video, Long> {
  List<Video> findByTitle(String title);
}


