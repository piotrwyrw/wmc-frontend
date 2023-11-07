async function productTable() {
    let wrapper = document.getElementById("products-table");
    let table = document.createElement('table')

    let json = await fetch("http://localhost:8877/products")
        .then(data => data.json)

    for (let product in json) {
        console.log(product)
    }

    wrapper.appendChild(table)
}

productTable()