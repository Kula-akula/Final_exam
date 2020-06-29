package it.academy.FinalExam.Service.ServiceImplimitation;

import it.academy.FinalExam.Entity.GetCount;
import it.academy.FinalExam.Entity.PostCount;
import it.academy.FinalExam.Repository.GetCountRepo;
import it.academy.FinalExam.Repository.PostCountRepo;
import it.academy.FinalExam.Service.GetCountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GetCountServiceImpl implements GetCountService {
    @Autowired
    private GetCountRepo getCountRepo;
    @Autowired
    private PostCountRepo postCountRepo;

    @Override
    public GetCount save(GetCount getCount) {
        return getCountRepo.save(getCount);
    }

    @Override
    public List<PostCount> getPostCounts() {
        return postCountRepo.findAll();
    }
}
