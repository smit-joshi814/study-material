db.customer_order.aggregate({
    $group: {
        _id: "",
        total_value: {
            "$sum": {
                $multiply: ["$product_price", "$product_qty"]
            }
        }
    }
});


db.customer_order.aggregate({
    $group: {
        _id: "",
        average_price: {
            "$avg": "$product_price"
        }
    }
});

db.customer_order.aggregate({
    $group: {
        _id: "$product_name",
        most_expensive: {
            "$max": "$product_price"
        }
    }
});

db.customer_order.aggregate({
    $group: {
        _id: "$category",
        total_value: {
            "$sum": {
                $multiply: ["$product_price", "$product_qty"]
            }
        }
    }
});

db.customer_order.aggregate({
    $group: {
        _id: "$category",
        total_value: {
            "$avg": "$product_price"

        }
    }
});
