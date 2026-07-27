package com.pondipb.pondibrian.ukulimaiq.ui.prices

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pondipb.pondibrian.ukulimaiq.databinding.ItemMarketPriceBinding
import com.pondipb.pondibrian.ukulimaiq.domain.MarketPrice

class MarketPriceAdapter(
    private val prices: List<MarketPrice>
) : RecyclerView.Adapter<MarketPriceAdapter.PriceViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PriceViewHolder {
        val binding = ItemMarketPriceBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return PriceViewHolder(binding)
    }

    override fun onBindViewHolder(holder: PriceViewHolder, position: Int) {
        holder.bind(prices[position])
    }

    override fun getItemCount(): Int = prices.size

    class PriceViewHolder(
        private val binding: ItemMarketPriceBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(price: MarketPrice) {
            binding.textCropName.text = price.cropName
            binding.textPrice.text = price.priceLabel
        }
    }
}
