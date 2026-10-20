            <div className="product-listing">
            <h1>Featured Products</h1>
            <div className="products-grid">
            {products.map(product => (
            <ProductItem key={product.id} product={product} />
            ))}
            </div>
            </div>
            );
            }

            export default ProductListingPage;
      