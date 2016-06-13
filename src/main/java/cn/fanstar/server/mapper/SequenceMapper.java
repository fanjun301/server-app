package cn.fanstar.server.mapper;


import cn.fanstar.server.dto.Sequence;
import org.springframework.stereotype.Component;

@Component
public interface SequenceMapper {

  Sequence getSequence(Sequence sequence);
  void updateSequence(Sequence sequence);
}
