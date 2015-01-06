package com.sannong.service;

import java.util.List;
import java.util.Map;

import com.sannong.domain.applications.Answer;
import com.sannong.domain.applications.Application;
import com.sannong.domain.applications.Question;
import com.sannong.domain.applications.Questionnaire;

public interface IProjectService {
    Application getApplicationBy(String userName);

    Questionnaire getQuestionnaire(Long applicationId, Integer questionnaireNumber);

    List<Question> getQuestionsByQuestionnaireNumber(Integer number);

    int getTotalQuestions();

    void makeApplication(Application application) throws Exception;

    boolean updateAnswersAndComment(Answer answer) throws Exception;

}
