//package com.project.ecommerce.service.impl;
//
//import com.project.ecommerce.dto.CourseEditDTO;
//import com.project.ecommerce.entity.CourseEdit;
//import com.project.ecommerce.repository.CourseEditRepository;
//import com.project.ecommerce.repository.mapper.CourseEditMapper;
//import com.project.ecommerce.service.CourseEditService;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.StringJoiner;
//import java.util.stream.Collectors;
//
//@Service
//@Slf4j
//public class CourseEditServiceImpl implements CourseEditService {
//    @Autowired
//    CourseEditRepository repository;
//
//    @Autowired
//    CourseEditMapper mapper;
//
//    @Override
//    public CourseEditDTO create(CourseEditDTO tspDTO) {
//        CourseEditDTO result = new CourseEditDTO();
//        try {
//            CourseEdit tsp = mapper.convertDTOToEntity(tspDTO);
//            result = mapper.convertEntityToDTO(repository.saveAndFlush(tsp));
//        } catch (Exception e) {
//            log.error("Error when creating:", e);
//        }
//        return result;
//
//    }
//
//    @Override
//    public boolean update(CourseEditDTO dto) {
//        try {
//            CourseEdit tsp = mapper.convertDTOToEntity(dto);
//            if (dto.getLessonEdits().size() > 0) {
//                StringJoiner lessionLst = new StringJoiner(",");
//                dto.getLessonEdits().stream().forEach(item -> {
//                    lessionLst.add(item.getId().toString());
//                });
//                tsp.setLessonList(lessionLst.toString());
//            }
//            mapper.convertEntityToDTO(repository.saveAndFlush(tsp));
//            return true;
//        } catch (Exception e) {
//            log.error("Error when creating:", e);
//            return false;
//        }
//    }
//
//    @Override
//    public List<CourseEditDTO> findAll() {
//        List<CourseEdit> tsp = repository.findAll();
//        return tsp == null ? new ArrayList<>() :
//                tsp.stream().map(entity -> mapper.convertEntityToDTO(entity)).collect(Collectors.toList());
//    }
//
//
//    @Override
//    public boolean delete(Long id) {
//        CourseEdit tsp = repository.findById(id).get();
//        if (tsp != null) {
//            repository.delete(tsp);
//            return true;
//        }
//        return false;
//    }
//
//    @Override
//    public CourseEditDTO findByCourseEditId(Long id) {
//        CourseEdit entity = repository.findById(id) != null ? repository.findById(id).get() : new CourseEdit();
//        return mapper.convertEntityToDTO(entity);
//    }
//
//    @Override
//    public CourseEditDTO saveOrUpdate(CourseEditDTO dto) {
//        if (dto.getId() == null) {
//            return create(dto);
//        } else {
//            return update(dto) ? dto : null;
//        }
//    }
//
//
//}
//
