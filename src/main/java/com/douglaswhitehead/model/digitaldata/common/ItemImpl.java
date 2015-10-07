package com.douglaswhitehead.model.digitaldata.common;

import com.douglaswhitehead.model.digitaldata.cart.Price;
import com.douglaswhitehead.model.digitaldata.product.Product;
import com.douglaswhitehead.model.digitaldata.product.ProductInfo;
import com.douglaswhitehead.model.digitaldata.security.Security;

/**
 * Implementation of the Item interface.
 * 
 * @author douglas whitehead
 *
 */
public class ItemImpl extends BaseImpl implements Item {

	/**
	 * String constant for <tt>productInfo</tt>.
	 */
	private final static String PRODUCT_INFO = "productInfo";
	
	/**
	 * String constant for <tt>category</tt>.
	 */
	private final static String CATEGORY = "category";
	
	/**
	 * String constant for <tt>quantity</tt>.
	 */
	private final static String QUANTITY = "quantity";
	
	/**
	 * String constant for <tt>price</tt>.
	 */
	private final static String PRICE = "price";
	
	/**
	 * String constant for <tt>linkedProduct</tt>.
	 */
	private final static String LINKED_PRODUCT = "linkedProduct";
	
	/**
	 * String constant for <tt>attributes</tt>.
	 */
	private final static String ATTRIBUTES = "attributes";
	
	/**
	 * ItemImpl constructor.
	 * 
	 * @param Security security
	 * @param ProductInfo productInfo
	 * @param Category category
	 * @param Integer quantity
	 * @param Price price
	 * @param Product[] linkedProduct
	 * @param Attributes attributes
	 */
	private ItemImpl(
		final Security security,
		final ProductInfo productInfo,
		final Category category,
		final Integer quantity,
		final Price price,
		final Product[] linkedProduct,
		final Attributes attributes
	) {
		this.security = security;
		this.map.put(PRODUCT_INFO, productInfo);
		this.map.put(CATEGORY, category);
		this.map.put(QUANTITY, quantity);
		this.map.put(PRICE, price);
		this.map.put(LINKED_PRODUCT, linkedProduct);
		this.map.put(ATTRIBUTES, attributes);
	}
	
	/**
	 * Returns the ProductInfo object.
	 * 
	 * @return ProductInfo
	 */
	public ProductInfo getProductInfo() {
		return (ProductInfo)map.get(PRODUCT_INFO);
	}
	
	/**
	 * Returns the Category object.
	 * 
	 * @return Category
	 */
	public Category getCategory() {
		return (Category)map.get(CATEGORY);
	}
	
	/**
	 * Returns the Quantity object.
	 * 
	 * @return Integer
	 */
	public Integer getQuantity() {
		return (Integer)map.get(QUANTITY);
	}
	
	/**
	 * Returns the Price object.
	 * 
	 * @return Price
	 */
	public Price getPrice() {
		return (Price)map.get(PRICE);
	}
	
	/**
	 * Returns the LinkedProduct array.
	 * 
	 * @return Product[]
	 */
	public Product[] getLinkedProduct() {
		return (Product[])map.get(LINKED_PRODUCT);
	}
	
	/**
	 * Returns the Attributes object.
	 * 
	 * @return Attributes
	 */
	public Attributes getAttributes() {
		return (Attributes)map.get(ATTRIBUTES);
	}
	
	/**
	 * Implementation of the Item.Builder interface.
	 * 
	 * @author douglas whitehead
	 *
	 */
	public static class Builder extends BaseImpl.Builder<Builder> implements Item.Builder {

		/**
		 * Builds the ProductInfo object.
		 * 
		 * @param ProductInfo productInfo
		 * @return Builder
		 */
		public Builder productInfo(final ProductInfo productInfo) {
			this.map.put(PRODUCT_INFO, productInfo);
			this.previous = PRODUCT_INFO;
			return builder();
		}
		
		/**
		 * Builds the Category object.
		 * 
		 * @param Category category
		 * @return Builder
		 */
		public Builder category(final Category category) {
			this.map.put(CATEGORY, category);
			this.previous = CATEGORY;
			return builder();
		}
		
		/**
		 * Builds the Quantity object.
		 * 
		 * @param Integer quantity
		 * @return Builder
		 */
		public Builder quantity(final Integer quantity) {
			this.map.put(QUANTITY, quantity);
			this.previous = QUANTITY;
			return builder();
		}
		
		/**
		 * Builds the LinkedProduct array.
		 * 
		 * @param Product[] linkedProduct
		 * @return Builder
		 */
		public Builder linkedProduct(final Product[] linkedProduct) {
			this.map.put(LINKED_PRODUCT, linkedProduct);
			this.previous = LINKED_PRODUCT;
			return builder();
		}
		
		/**
		 * Builds the Price object.
		 * 
		 * @param Price price
		 * @return Builder
		 */
		public Builder price(final Price price) {
			this.map.put(PRICE, price);
			this.previous = PRICE;
			return builder();
		}
		
		/**
		 * Builds the Attributes object.
		 * 
		 * @param Attributes attributes
		 * @return Builder
		 */
		public Builder attributes(final Attributes attributes) {
			this.map.put(ATTRIBUTES, attributes);
			this.previous = ATTRIBUTES;
			return builder();
		}
		
		/**
		 * Builds and returns the ItemImpl object.
		 * 
		 * @return ItemImpl
		 */
		public ItemImpl build() {
			return new ItemImpl(
				security,
				(ProductInfo)map.get(PRODUCT_INFO),
				(Category)map.get(CATEGORY),
				(Integer)map.get(QUANTITY),
				(Price)map.get(PRICE),
				(Product[])map.get(LINKED_PRODUCT),
				(Attributes)map.get(ATTRIBUTES)
			);
		}
		
		/**
		 * Returns the Builder.
		 * 
		 * @return Builder
		 */
		@Override
		protected Builder builder() {
			return this;
		}
	}
	
}
