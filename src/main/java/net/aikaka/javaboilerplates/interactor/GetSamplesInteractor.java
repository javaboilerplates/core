package net.aikaka.javaboilerplates.interactor;

import net.aikaka.javaboilerplates.entity.SampleEntity;

import java.util.List;

public interface GetSamplesInteractor {
    List<SampleEntity> all();
    List<SampleEntity> allByName(String keyword);
}
