package lyjak.anna.recogenre.service;

import java.util.List;

import lyjak.anna.recogenre.model.ClassificationResult;
import retrofit2.Call;
import retrofit2.http.GET;

public interface GetClassificationService {

    @GET("/predict")
    Call<List<ClassificationResult>> getClassificationResult();
}
