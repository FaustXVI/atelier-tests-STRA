package com.pharmashopping.catalogue.repository;

import com.pharmashopping.catalogue.model.ProduitCatalogue;
import com.pharmashopping.data.IDataBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Repository des clients
 */
@Repository
public class StubCatalogueProduits implements CatalogueProduits {

    @Autowired
    private IDataBase database;


    @Override
    public List<ProduitCatalogue> retrieveAll() {
        return database.getProduits();
    }

    @Override
    public ProduitCatalogue get(String reference) {
        return database.getProduit(reference);
    }

}
