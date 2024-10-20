const products = [
    {
        title: "Wall shelf unit, 30x190 cm",
        price: "$99.99",
        image: "https://www.ikea.com/ma/en/images/products/lack-wall-shelf-unit-white__1092772_pe863015_s5.jpg?f=xxs",
        brand: 'IKEA'
    },
    {
        title: "Storage combination, 190x90 cm",
        price: "$400.99",
        image: "https://www.ikea.com/ma/en/images/products/skruvby-storage-combination-white__1291706_pe934969_s5.jpg?f=xxs",
        brand: 'Marcos'
    },
    {
        title: "Shelving unit, 100x95 cm",
        price: "$49.99",
        image: "https://www.ikea.com/ma/en/images/products/fjaellbo-shelving-unit-black__0849617_pe616391_s5.jpg?f=xxs",
        brand: 'IKEA'
    },
    {
        title: "Wall shelf, 50x52 cm",
        price: "$59.99",
        image: "https://www.ikea.com/ma/en/images/products/apotekare-wall-shelf-black__1282054_pe932076_s5.jpg?f=xxs",
        brand: 'Liddy'
    },
    {
        title: "Bookcase, 40x28x106 cm",
        price: "$69.99",
        image: "https://www.ikea.com/ma/en/images/products/billy-bookcase-dark-brown-oak-effect__1104285_pe867573_s5.jpg?f=xxs",
        brand: 'Marcos'
    },
    {
        title: "Cabinet combination with feet, 105x35x107 cm",
        price: "$108.99",
        image: "https://www.ikea.com/ma/en/images/products/eket-cabinet-combination-with-feet-walnut-effect__1352192_pe952148_s5.jpg?f=xxs",
        brand: 'Caressa'
    },
];

const cardContainer = document.getElementById("card-container");
const searchInput = document.getElementById('searchInput');


// Function to display products
function displayProducts(filterBrand, searchTerm) {
    cardContainer.innerHTML = '';
    console.log("searchTerm " + searchTerm)
    const filteredProducts = products.filter(product => {
        const matchesBrand = filterBrand === 'all' || product.brand === filterBrand;
        searchTerm = searchTerm === undefined ? '' : searchTerm;
        const matchesSearch = product.title.toLowerCase().includes(searchTerm.toLowerCase());
        return matchesBrand && matchesSearch;
    });

    filteredProducts.forEach(product => {
        const card = document.createElement("div");
        card.className = "card";
        card.innerHTML = `
            <img src="${product.image}" alt="${product.title}">
            <div class="card-content">
                <h2>${product.title}</h2>
                <p>${product.price}</p>
            </div>
        `;
        cardContainer.appendChild(card);
    });
}



// Initial display of all products
displayProducts('all', '');

// Add event listeners to filter buttons
document.querySelectorAll('.filter-btn').forEach(button => {
    button.addEventListener('click', (event) => {
        event.preventDefault();
        const brand = button.getAttribute('data-brand');
        displayProducts(brand);
    });
});


// Add event listener to the search input
searchInput.addEventListener('input', () => {
    const currentBrand = document.querySelector('.filter-btn.active')?.getAttribute('data-brand') || 'all';
    displayProducts(currentBrand, searchInput.value);
});