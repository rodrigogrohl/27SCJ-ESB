# Operations

 * Order T-shirt
 ** check that all data in the request is filled out correctly
 ** Check that an order for that email does not exist already - throw SOAP fault
 ** Place the order information in a database with an order ID
 ** Log an "Order Tshirt" event to KissMetrics 
 *** event name = "Order Tshirt"
 *** person = email address
 *** properties = [ host = IP address ]
 ** return order id
 * List inventory
 ** Generate dummy information based which shows a few tshirts available in all sizes
 ** Log a "List Inventory" event to KissMetrics 
 *** event name = "List Inventory"
 *** person = email address
 *** properties = [ host = IP address ]
 * Track
 ** TODO: implement this operation
 ** 
