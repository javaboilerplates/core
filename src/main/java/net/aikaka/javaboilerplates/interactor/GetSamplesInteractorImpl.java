package net.aikaka.javaboilerplates.interactor;

import net.aikaka.javaboilerplates.entity.SampleEntity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetSamplesInteractorImpl implements GetSamplesInteractor {

    private List<SampleEntity> samples;

    public GetSamplesInteractorImpl(List<SampleEntity> samples) {
        this.samples = samples;
    }

    public GetSamplesInteractorImpl() {
        String names[] = new String[]{"Kaka", "Ronaldo"};

        this.samples = new ArrayList<>();

        for (String name : names) {
            this.samples.add(new SampleEntity().name(name));
        }
    }

    @Override
    public List<SampleEntity> All() {
        return samples;
    }


    @Override
    public List<SampleEntity> AllByName(final String keyword) {
        if (keyword == null)
            return new ArrayList<>();

        return samples
                .stream()
                .filter(e -> e.getName().toLowerCase().contains(keyword.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<SampleEntity> getSamples() {
        return samples;
    }

    public void setSamples(List<SampleEntity> samples) {
        this.samples = samples;
    }
}
