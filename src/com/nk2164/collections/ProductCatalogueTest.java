package com.nk2164.collections;

import static com.nk2164.collections.ProductFixtures.*;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class ProductCatalogueTest {

	@Test
	public void shouldOnlyHoldUniqueProducts() throws Exception {
		ProductCatalogue catalogue = new ProductCatalogue();
		
		catalogue.isSuppliedBy(bobs);
		catalogue.isSuppliedBy(kates);
		
		assertThat(catalogue, containsInAnyOrder(door,floorPanel));
	}
}
