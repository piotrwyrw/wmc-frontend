package dev.vanadium.wmc.backend.service

import dev.vanadium.wmc.backend.entities.Product
import jakarta.annotation.PostConstruct
import org.springframework.stereotype.Service
import java.util.*

@Service
class ProductManager(
    val products: ArrayList<Product> = arrayListOf()
) {

    @PostConstruct
    fun addSampleProducts() {
        addProduct(Product("ServerPro Xeon Rack", 4999.99, true, "High-performance server rack with Intel Xeon processors and redundant power supplies."))
        addProduct(Product("QuantumCrypt Firewall", 2599.50, true, "Enterprise-grade firewall with quantum encryption capabilities."))
        addProduct(Product("CloudMesh Router", 1299.99, false, "Dual-band Wi-Fi 6 router optimized for cloud computing environments."))
        addProduct(Product("DataStream NAS", 1499.00, true, "Network attached storage with 10TB capacity and RAID support."))
        addProduct(Product("HyperLink Fiber Switch", 799.99, true, "48-port gigabit switch with fiber optic uplinks for high-speed networking."))
        addProduct(Product("Titan Workstation", 3599.95, true, "Dual GPU workstation with ECC memory for intensive computational tasks."))
        addProduct(Product("RackCool Precision AC", 2499.00, false, "Precision air conditioning unit for server racks with energy-efficient cooling."))
        addProduct(Product("PowerGrid UPS", 999.99, true, "Uninterruptible power supply with 1500VA load capacity and power conditioning."))
        addProduct(Product("OptiCore Patch Panel", 199.99, true, "High-density 24-port Cat6a patch panel with shielded ports."))
        addProduct(Product("SecureVault Data Safe", 4599.00, true, "Fireproof and waterproof data safe with biometric security for sensitive data storage."))
    }

    fun productByID(id: UUID): Product? {
        val prods = products.filter {
            it.id == id
        }

        assert(prods.size in 0..1)

        return prods.firstOrNull()
    }

    fun addProduct(prod: Product) {
        this.products.add(prod)
    }

    fun removeProduct(id: UUID): Boolean {
        val prod = productByID(id)

        if (prod == null)
            return false;

        this.products.remove(prod)
        return true
    }

    fun allProducts(): List<Product> {
        return this.products
    }

}