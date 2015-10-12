# What is this?

This is a server-side implementation of the CEDDL, written in Java.

# What is the CEDDL?

CEDDL stands for *Customer Experience Digital Data Layer*. Version 1.0 of the specification was produced by the [Customer Experience Digital Data Community Group](https://www.w3.org/community/custexpdata/) and defined in the [W3C Community Group Final Report](https://www.w3.org/community/custexpdata/2013/12/16/final-report-customer-experience-digital-data-layer-v1-0-ready/).

It is important to note that the Customer Experience Digital Data Community Group is a *Community Group*, which means the group "may produce Specifications," however "these are not standards-track documents but may become input to the standards process."

In other words, the CEDDL is not an official W3C standard.

# Well then why should I care?

Surfacing marketing data is hard. The amount of data available, how to structure it, and how to present it, consistently, can be overwhelming. The CEDDL can be a great place to start for marketers that want to make the most of the data they have available in house to drive marketing goals. Oftentimes, this data will be presented as a *data layer*. 

# What is a data layer?

I'm glad you asked! A data layer is a common data dictionary, used across the enterprise, to feed all marketing technology systems (e.g. analytics, personalization & optimization, data management platforms, ad servers, etc.) in use by marketing programs.

# Kewl. How does this work?

See the tests for examples. There are plans to create another document with further examples.

# Isn't the data layer supposed to be client-side?

According to the CEDDL specification, the data layer should be presented as a JavaScript object called `digitalData`. However, business requirements will often dictate that behavior of the `digitalData` object change from page-to-page, since different sections of the website, mobile app, or other environment will often make different data available to the `digitalData` object.

An example would be the `digitalData.cart` sub-object. As a user interacts with the website, they will likely add and/or remove various items to the shopping cart, the data for which would be reflected in the `digitalData.cart` sub-object. This alone will usually require frequent recalculations of the objects within the `digitalData.cart` sub-object, and if the user purchases one or more of the items in their cart, then the `digitalData.cart.item[n]` array needs to be updated, various properties of `digitalData.cart` need to be recalculated, and then the `digitalData.transaction` sub-object needs to be fully populated with all of the attendant items, calculations, and properties related to the purchase. 

That is hard to manage solely in JavaScript, and in modern application environments (including single-page apps), much of this can be off-loaded to the server, where it is more easily and more safely managed.

A server-side implementation also allows for a hybrid approach, whereby parts of the data layer are primarily managed server-side, while other parts (particularly items in the `digitalData.event[n]` array) are managed client-side. I hope to produce some examples of this shortly.

# Why didn't you just use one of the other implementations out there?

Yes, there are already a few different server-side implementations of the CEDDL, written in Java, publicly available, most notably [Sieger Veenstra](https://github.com/siegerveenstra)'s [ceddl4j](https://github.com/mirabeau-nl/ceddl4j). I found the specific class methods and application of fluent-style coding in ceddl4j non-intuitive and wanted a particular style that was familiar to my expectations, but there is absolutely nothing wrong with it (indeed, I took inspiration from several of its approaches, particularly the `*.security` object defined in section 6.11 of the specification), and what library to use probably comes down to personal preference. ceddl4j is a great library, I just wanted something a little different.

I don't have much experience with the other implementations.