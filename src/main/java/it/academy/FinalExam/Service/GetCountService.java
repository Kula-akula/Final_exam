package it.academy.FinalExam.Service;

import it.academy.FinalExam.Entity.GetCount;
import it.academy.FinalExam.Entity.PostCount;

import java.util.List;

public interface GetCountService extends BaseService<GetCount> {
//    GetCount save(GetCount getCount);

    List<PostCount> getPostCounts();
}
