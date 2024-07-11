package br.com.alura.forumhub.service;

import br.com.alura.forumhub.exception.ResourceNotFoundException;
import br.com.alura.forumhub.model.Topic;
import br.com.alura.forumhub.repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics() {
        return topicRepository.findAll();
    }

    public Optional<Topic> getTopicById(Long id) {
        return topicRepository.findById(id);
    }

    public Topic createTopic(Topic topic) {
        topic.setCreationDate(LocalDateTime.now());
        return topicRepository.save(topic);
    }

    public Topic updateTopic(Long id, Topic updatedTopic) {
        return topicRepository.findById(id)
                .map(topic -> {
                    topic.setTitle(updatedTopic.getTitle());
                    topic.setMessage(updatedTopic.getMessage());
                    topic.setStatus(updatedTopic.getStatus());
                    topic.setAuthor(updatedTopic.getAuthor());
                    topic.setCourse(updatedTopic.getCourse());
                    return topicRepository.save(topic);
                }).orElseThrow(() -> new ResourceNotFoundException("Topic not found with id " + id));
    }

    public void deleteTopic(Long id) {
        topicRepository.deleteById(id);
    }
}
