package it.academy.FinalExam.Service.ServiceImplimitation;

import it.academy.FinalExam.Entity.Report;
import it.academy.FinalExam.Repository.ReportRepo;
import it.academy.FinalExam.Service.ReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReportServiceImpl implements ReportService {
    @Autowired
    private ReportRepo reportRepo;

    @Override
    public List<Report> getAll() {
        return reportRepo.findAll();
    }
}
