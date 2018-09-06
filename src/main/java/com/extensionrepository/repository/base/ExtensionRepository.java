package com.extensionrepository.repository.base;

import com.extensionrepository.entity.Extension;

import java.util.List;

public interface ExtensionRepository {
    List<Extension> getAll();
    List<Extension> getPending();
    List<Extension> getNewest();
    List<Extension> getPopular();
    List<Extension> getFeatured();
    List<Extension> filterByName(String name);
    List<Extension> filterByDate(String name);
    List<Extension> filterByDownloads(String name);
    List<Extension> filterByLastCommit(String name);
    Extension getById(int id);
    Extension getByName(String name);
    boolean save(Extension extension);
    Extension update(Extension extension);
    Extension delete(Extension extension);
}
