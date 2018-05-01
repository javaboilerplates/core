package net.aikaka.javaboilerplates.core.interactor;

import net.aikaka.javaboilerplates.core.entity.SampleEntity;

import java.util.List;

public interface GetSamplesInteractor {
    List<SampleEntity> all();
    List<SampleEntity> allByName(String keyword);
}
