import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;

import java.util.ArrayList;

public class AdaptadoLista  extends RecyclerView.Adapter<AdaptadoLista.viewHolder> {

    ArrayList<String> ListaDeDatos;

    public AdaptadoLista(ArrayList<String> listaDeDatos) {
        ListaDeDatos = listaDeDatos;

    }

    @NonNull
    @Override
    public AdaptadoLista.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View vistaListado= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_de_lista,null, false);
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadoLista.viewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return ListaDeDatos.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        public viewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
