class AddImageToQuote < ActiveRecord::Migration[7.1]
  def change
    add_column :quotes, :image, :string
  end
end
